package net.blazepickaxes;

import net.blazepickaxes.registry.Tools;
import net.fabricmc.api.ModInitializer;

public class BlazePickaxes implements ModInitializer {

    public static final String ID = "blazepickaxes";

	@Override
	public void onInitialize() {
		Tools.register();
	}
}