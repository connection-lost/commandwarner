package me.crafter.mc.commandwarner;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class cwarner implements Listener {
	
@EventHandler
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event){
	String pname = event.getPlayer().getName();
	String cmd = event.getMessage();
	if (event.getPlayer().isOp()) return;
	if (cmd.toLowerCase().contains("op")|| cmd.toLowerCase().contains("//wand") || cmd.toLowerCase().contains("ban") || cmd.toLowerCase().contains("kick") || cmd.toLowerCase().contains("stop") || cmd.toLowerCase().contains("reload") || cmd.toLowerCase().contains("plugins") || cmd.toLowerCase().contains("fly")){
		Bukkit.broadcastMessage(ChatColor.DARK_RED+"Warning! "+pname+" tried to use command "+cmd);
	}
	
}

	
	

}
