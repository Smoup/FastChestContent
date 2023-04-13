package main.fcc;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class BukkitEventHandler implements Listener {
    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent event) {
        if (FastChestContent.getInteractFlag().get(event.getPlayer().getName())) {
            if (event.getInventory().getType() == InventoryType.CHEST) {
                ItemStack[] contents = event.getInventory().getContents();
                ArrayList<Material> chestList = new ArrayList<>();

                for (ItemStack item : contents) {
                    if (item != null) {
                        chestList.add(item.getType());
                    }
                }
                Bukkit.getLogger().info("[" + FastChestContent.getInstance().getName() + "] " + chestList);
            }
        }
    }
}
