package main.fcc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (FastChestContent.getInteractFlag().get(sender.getName()) == null || !FastChestContent.getInteractFlag().get(sender.getName())) {
            FastChestContent.getInteractFlag().put(sender.getName(), true);
            sender.sendMessage(ChatColor.GRAY + "Вы включили " + ChatColor.YELLOW + "FCC" + ChatColor.GRAY + " для себя");
        } else {
            FastChestContent.getInteractFlag().put(sender.getName(), false);
            sender.sendMessage(ChatColor.GRAY + "Вы отключили " + ChatColor.YELLOW + "FCC" + ChatColor.GRAY + " для себя");
        }

        return true;
    }
}
