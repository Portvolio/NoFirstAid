package wtf.violet.portvolio.nofirstaid;

import org.bukkit.plugin.java.JavaPlugin;
import wtf.violet.portvolio.nofirstaid.listener.HealListener;

public final class NoFirstAid extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new HealListener(), this);
    }
    
}
