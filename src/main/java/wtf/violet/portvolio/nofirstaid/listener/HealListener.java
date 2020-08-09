package wtf.violet.portvolio.nofirstaid.listener;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class HealListener implements Listener
{

    @EventHandler
    public void onEntityRegainHealth(final EntityRegainHealthEvent event)
    {
        if (event.getEntityType() == EntityType.PLAYER)
        {
            event.setCancelled(true); // lol
        }
    }

    @EventHandler
    public void onPotionEffect(final EntityPotionEffectEvent event)
    {
        final PotionEffect newEffect = event.getNewEffect();

        if (newEffect == null)
        {
            return;
        }

        if (
            event.getEntityType() == EntityType.PLAYER &&
                newEffect.getType() == PotionEffectType.ABSORPTION
        )
        {
            event.setCancelled(true);
        }
    }

}
