package com.exorastudios.pay.api.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@Getter
@RequiredArgsConstructor
public class ExoPayEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();

    private final OfflinePlayer sender;
    private final OfflinePlayer receiver;
    private final double amount;
    private final boolean success;
    private final String message;

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }
}
