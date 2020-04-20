package net.minecraft.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;

public class TreeFeature extends AbstractSmallTreeFeature<TreeFeatureConfig> {
   public TreeFeature(Function<Dynamic<?>, ? extends TreeFeatureConfig> p_i225820_1_) {
      super(p_i225820_1_);
   }

   public boolean func_225557_a_(IWorldGenerationReader generationReader, Random rand, BlockPos p_225557_3_, Set<BlockPos> p_225557_4_, Set<BlockPos> p_225557_5_, MutableBoundingBox p_225557_6_, TreeFeatureConfig p_225557_7_) {
      int i = p_225557_7_.baseHeight + rand.nextInt(p_225557_7_.heightRandA + 1) + rand.nextInt(p_225557_7_.heightRandB + 1);
      int j = p_225557_7_.trunkHeight >= 0 ? p_225557_7_.trunkHeight + rand.nextInt(p_225557_7_.trunkHeightRandom + 1) : i - (p_225557_7_.foliageHeight + rand.nextInt(p_225557_7_.foliageHeightRandom + 1));
      int k = p_225557_7_.foliagePlacer.func_225573_a_(rand, j, i, p_225557_7_);
      Optional<BlockPos> optional = this.func_227212_a_(generationReader, i, j, k, p_225557_3_, p_225557_7_);
      if (!optional.isPresent()) {
         return false;
      } else {
         BlockPos blockpos = optional.get();
         this.setDirtAt(generationReader, blockpos.down(), blockpos);
         p_225557_7_.foliagePlacer.func_225571_a_(generationReader, rand, p_225557_7_, i, j, k, blockpos, p_225557_5_);
         this.func_227213_a_(generationReader, rand, i, blockpos, p_225557_7_.trunkTopOffset + rand.nextInt(p_225557_7_.trunkTopOffsetRandom + 1), p_225557_4_, p_225557_6_, p_225557_7_);
         return true;
      }
   }
}