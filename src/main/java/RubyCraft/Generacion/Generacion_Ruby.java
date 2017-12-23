package RubyCraft.Generacion;

import java.util.Random;

import RubyCraft.Iniciar.Bloques;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class Generacion_Ruby implements IWorldGenerator{

	@Override
	public void generate(Random rand, int x, int z, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
			
		switch(world.provider.getDimension()){
		
		case 0:
			generateOverWorld(world,rand,x,z);
			break;
		case 1:
			generateEnd(world,rand,x,z);
		}
	}

	private void generateEnd(World world, Random rand, int x, int z) {
		generateOre(Bloques.mena_de_ruby_end, world, rand, x, z, 5,10, 6, 0, 101, Blocks.END_STONE);

		
	}

	public void generateOverWorld(World world, Random rand, int x, int z) {
    	generateOre(Bloques.mena_de_ruby, world, rand, x, z, 3, 10, 10, 0, 70, Blocks.STONE);
	}

public void generateOre(Block block, World world, Random rand, int chunkX, int chunkZ, int minVeinSize, int MaxVeinSize, int chance, int minY, int MaxY, Block generateIn){
	int veinSize = minVeinSize + rand.nextInt(MaxVeinSize - minVeinSize);
	int HeighRange = MaxY - minY;
	WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(), veinSize, BlockMatcher.forBlock(generateIn));
	for(int i = 0; i < chance; i++){
		int xRand = chunkX * 16 + rand.nextInt(16);
		int yRand = rand.nextInt(HeighRange);
		int zRand = chunkZ * 16 + rand.nextInt(16);
		BlockPos newpos = new BlockPos(xRand,yRand,zRand);
		gen.generate(world, rand, newpos);
	}
}

    
	}