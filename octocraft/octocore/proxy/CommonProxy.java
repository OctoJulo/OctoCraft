package octogeek.octocraft.octocore.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event);

	public void init(FMLInitializationEvent event);

	void postInit();

	//public void init(FMLInitializationEvent event);

//	void preInit(FMLInitializationEvent event);
}
