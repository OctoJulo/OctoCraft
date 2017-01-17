package octogeek.octocraft.octocore.proxy;

import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import octogeek.octocraft.octocore.Config;
import octogeek.octocraft.octocore.OctoReference;
import octogeek.octocraft.octocore.register.Register;
import octogeek.octocraft.octocore.register.SoundRegister;
import octogeek.octocraft.octofurniture.OctoFurniture;
import octogeek.octocraft.octoindustry.OctoIndustry;
import octogeek.octocraft.octomineralogy.OctoMineralogy;


public class ClientProxy implements CommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		Configuration conf = Config.init(event.getSuggestedConfigurationFile());		
		OctoMineralogy.preInit(event,conf);
		OctoIndustry.preInit();
		OctoFurniture.preInit(event, conf);
	}
	@Override
	public void init(FMLInitializationEvent event) {
		OctoMineralogy.init(event);
		OctoIndustry.init(event);
		OctoFurniture.init(event);
//		ModCrafting.register();

	}
	@Override
	public void postInit(){

	}

}
