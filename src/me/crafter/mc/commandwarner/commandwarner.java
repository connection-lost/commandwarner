package me.crafter.mc.commandwarner;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class commandwarner extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public final cwarner cw = new cwarner();
	
@Override
    public void onEnable(){
    	PluginDescriptionFile pdfFile = getDescription();
        this.logger.info("CommandWarner " + pdfFile.getVersion() + " has been ENABLED!");
        this.logger.info("CommandWarner is a Rev-Craft custom plugin.");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this.cw, this);
        }
 
@Override
    public void onDisable() {
    	PluginDescriptionFile pdfFile = getDescription();
        this.logger.info("CommandWarner " + pdfFile.getVersion() + " has been DISABLED!");
    }

	
}

