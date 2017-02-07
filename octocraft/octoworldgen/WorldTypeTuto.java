package octogeek.octocraft.octoworldgen;

import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerBiomeEdge;
import net.minecraft.world.gen.layer.GenLayerZoom;
import net.minecraftforge.common.DimensionManager;
import octogeek.octocraft.octoworldgen.biome.BiomeGenLayerTuto;
import octogeek.octocraft.octoworldgen.world.WorldChunkManagerTuto;
import octogeek.octocraft.octoworldgen.world.WorldProviderTuto;;
public class WorldTypeTuto extends WorldType {

	
	  public WorldTypeTuto(String name) {
		    super("nomDeVotreType");

		    //  DimensionManager.unregisterProviderType(0);
		    //  DimensionManager.registerProviderType(0, WorldProviderTuto.class, true);
		    DimensionManager.unregisterDimension(0);
		   //
		    DimensionType WorldTypeTuto = null;
			DimensionManager.registerDimension(0, WorldTypeTuto);

	}



	public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer)

	  {
	    GenLayer ret = new BiomeGenLayerTuto(200L, parentLayer);



	    ret = GenLayerZoom.magnify(1000L, ret, 2);

	    ret = new GenLayerBiomeEdge(1000L, ret);

	    return ret;



	  }



	  public WorldChunkManagerTuto getChunkManager(World world)

	  {

		  return new WorldChunkManagerTuto(world);

	  }
}
