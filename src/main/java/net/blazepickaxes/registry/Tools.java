package net.blazepickaxes.registry;

import static net.blazepickaxes.BlazePickaxes.ID;

import net.blazepickaxes.items.PickaxeBase;
import net.blazepickaxes.materials.items.ToolMaterialIron;
import net.blazepickaxes.materials.items.ToolMaterialDiamond;
import net.blazepickaxes.materials.items.ToolMaterialNetherite;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Tools {

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(ID, "blaze_iron_pickaxe"), new PickaxeBase(new ToolMaterialIron(), -1, -2.8F));
        Registry.register(Registry.ITEM, new Identifier(ID, "blaze_diamond_pickaxe"), new PickaxeBase(new ToolMaterialDiamond(), -1, -2.8F));
        Registry.register(Registry.ITEM, new Identifier(ID, "blaze_netherite_pickaxe"), new PickaxeBase(new ToolMaterialNetherite(), -1, -2.8F));
    }
}