package com.muhammaddaffa.playerprofiles.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

public class ProfileShiftRightClickEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private boolean cancelled;
    private final Player clickedTo;

    public ProfileShiftRightClickEvent(@NotNull Player who, @NotNull Player clickedTo) {
        super(who);
        this.clickedTo = clickedTo;
    }

    public Player getClickedTo() {
        return clickedTo;
    }

    @NotNull
    public HandlerList getHandlers() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

}