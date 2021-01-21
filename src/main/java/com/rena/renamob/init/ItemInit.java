package com.rena.renamob.init;

import com.rena.renamob.RenaMob;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RenaMob.MODID);
	
	public static final RegistryObject<Item> INGOT_COPPER = ITEMS.register("ingot_copper", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
}
