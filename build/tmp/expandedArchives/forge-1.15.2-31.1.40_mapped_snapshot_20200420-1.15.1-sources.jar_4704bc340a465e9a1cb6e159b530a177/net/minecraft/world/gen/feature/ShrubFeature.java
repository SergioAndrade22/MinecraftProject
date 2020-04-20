package net.minecraft.world.gen.feature;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.IWorldGenerationReader;

public class ShrubFeature extends AbstractTreeFeature<BaseTreeFeatureConfig> {
   public ShrubFeature(Function<Dynamic<?>, ? extends BaseTreeFeatureConfig> p_i225805_1_) {
      super(p_i225805_1_);
   }

   public boolean func_225557_a_(IWorldGenerationReader generationReader, Random rand, BlockPos p_225557_3_, Set<BlockPos> p_225557_4_, Set<BlockPos> p_225557_5_, MutableBoundingBox p_225557_6_, BaseTreeFeatureConfig p_225557_7_) {
      p_225557_3_ = generationReader.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, p_225557_3_).down();
      if (isSoil(generationReader, p_225557_3_, p_225557_7_.getSapling())) {
         p_225557_3_ = p_225557_3_.up();
         this.func_227216_a_(generationReader, rand, p_225557_3_, p_225557_4_, p_225557_6_, p_225557_7_);

         for(int i = 0; i <= 2; ++i) {
            int j = 2 - i;

            for(int k = -j; k <= j; ++k) {
               for(int l = -j; l <= j; ++l) {
                  if (Math.abs(k) != j || Math.abs(l) != j || rand.nextInt(2) != 0) {
                     this.func_227219_b_(generationReader, rand, new BlockPos(k + p_225557_3_.getX(), i + p_225557_3_.getY(), l + p_225557_3_.getZ()), p_225557_5_, p_225557_6_, p_225557_7_);
                  }
               }
            }
         }
      }

      return true;
   }
}