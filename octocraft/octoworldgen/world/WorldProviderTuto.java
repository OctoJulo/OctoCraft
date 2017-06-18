package octogeek.octocraft.octoworldgen.world;

import net.minecraft.init.Blocks;
import net.minecraft.world.WorldProviderSurface;

public class WorldProviderTuto extends WorldProviderSurface {
	
	
	
//	public boolean canCoordinateBeSpawn(int par1, int par2)	{
//
//		return this.worldObj.getTopBlock(par1, par2) == Blocks.GRASS || this.worldObj.getTopBlock(par1, par2) == Blocks.SAND || this.worldObj.getTopBlock(par1, par2) == Blocks.STONE || this.worldObj.getTopBlock(par1, par2) == Blocks.SNOW_LAYER;
//
//	}
    public String getDimensionName() {

        return "tuto";

    }
	public String getSaveFolder() {

		return "Tuto";

	}
}
