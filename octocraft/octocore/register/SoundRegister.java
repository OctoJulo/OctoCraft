package octogeek.octocraft.octocore.register;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import octogeek.octocraft.octocore.OctoReference;

public class SoundRegister {
	public static SoundEvent registerSound(String soundName) {
		ResourceLocation loc = new ResourceLocation(OctoReference.MOD_ID ,soundName);
		SoundEvent e = new SoundEvent(loc);
		return GameRegistry.register(e, loc);
		
	}
}
