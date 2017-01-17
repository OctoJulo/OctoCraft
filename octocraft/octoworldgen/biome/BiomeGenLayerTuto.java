package octogeek.octocraft.octoworldgen.biome;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class BiomeGenLayerTuto extends GenLayer {

	protected BiomeGenBase[] baseBiomes = {BiomeGenBase.plains};
	public BiomeGenLayerTuto(long seed, GenLayer genlayer)	{
		super(seed);

		this.parent = genlayer;


	}



	public BiomeGenLayerTuto(long seed)	{
		super(seed);
	

	}

	@Override
	public int[] getInts(int x, int z, int width, int depth)
	{

		int[] dest = IntCache.getIntCache(width * depth);



		for(int dz = 0; dz < depth; dz++)

		{



                }

	}

}
