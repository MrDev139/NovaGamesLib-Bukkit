package com.cloudcraftgaming.novagameslib.event.time;

import com.cloudcraftgaming.novagameslib.arena.Arena;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created by Nova Fox on 11/19/2016.
 * Website: www.cloudcraftgaming.com
 * For Project: NovaGamesLib-Bukkit
 */
@SuppressWarnings("unused")
public class WaitDelayStartEvent extends Event implements Cancellable {
    private final Integer id;
    private final String gameName;

    private Arena arena;
    private Integer waitDelay;
    private Boolean goToStartBool;

    private boolean cancelled;
    private static final HandlerList handlers = new HandlerList();

    /**
     * Constructor for WaitDelayStartEvent
     * @param _arena The arena that is involved in this event.
     * @param _waitDelay The wait delay (in seconds).
     */
    public WaitDelayStartEvent(Arena _arena, Integer _waitDelay) {
        arena = _arena;
        waitDelay = _waitDelay;
        goToStartBool = true;

        id = arena.getId();
        gameName = arena.getGameName();
    }

    /**
     * Gets the ID of the arena involved in this event.
     * @return The id of the arena involved in this event.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Gets the name of the minigame belonging to the arena involved in this event.
     * @return The name of the minigame belonging to the arena.
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * Gets the arena involved in this event.
     * @return The arena involved in this event.
     */
    public Arena getArena() {
        return arena;
    }

    /**
     * Gets the current wait delay in seconds.
     * @return The current wait delay in seconds.
     */
    public Integer getWaitDelay() {
        return waitDelay;
    }

    /**
     * Gets whether or not the arena will go on to the start delay.
     * By default, this is <code>true</code>.
     * @return Whether or not the arena will go on to the start delay.
     */
    public Boolean goToStart() {
        return goToStartBool;
    }

    /**
     * Sets the wait delay, in seconds.
     * @param _waitDelay The new wait delay, in seconds.
     */
    public void setWaitDelay(Integer _waitDelay) {
        waitDelay = _waitDelay;
    }

    /**
     * Sets whether or not the arena will go on to the start delay.
     * By default, this is <code>true</code>.
     * @param value Whether or not the arena will go on to the start delay.
     */
    public void setGoToStart(Boolean value) {
        goToStartBool = value;
    }

    /**
     * Whether or not the event is cancelled.
     * @return Whether or not the event is cancelled.
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sets whether or not the event is cancelled.
     * @param value Whether or not the event is cancelled.
     */
    public void setCancelled(boolean value) {
        cancelled = value;
    }

    /**
     * Bukkit method for getting handlers.
     * @return This event's HandlerList.
     */
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Bukkit method for getting handlers.
     * @return This event's HandlerList.
     */
    public static HandlerList getHandlerList() {
        return handlers;
    }
}