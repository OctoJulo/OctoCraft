package octogeek.octocraft.octoworldgen.biome;

import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomeGenLayerTuto extends GenLayer {

	

//	protected BiomeType[] baseBiomes = {BiomeType.plains};
	public BiomeGenLayerTuto(long seed, GenLayer genlayer)	{
		super(seed);

		this.parent = genlayer;


	}



	public BiomeGenLayerTuto(long seed)	{
		super(seed);
	

	}

	@Override
	public int[] getInts(int x, int z, int width, int depth) {

		int[] dest = IntCache.getIntCache(width * depth);

		for(int dz = 0; dz < depth; dz++) {
			for(int dx = 0; dx < width; dx++) {
				this.initChunkSeed(dx + x, dz + z);
				//dest[(dx + dz * width)] = this.baseBiomes[nextInt(this.baseBiomes.length)].biomeID;
			}
			
        }
		return dest;
	}
	
}
