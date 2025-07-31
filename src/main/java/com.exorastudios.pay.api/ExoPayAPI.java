package com.exorastudios.pay.api;

import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public interface ExoPayAPI {
    @NotNull PaymentResult pay(@NotNull OfflinePlayer sender, @NotNull OfflinePlayer receiver, double amount);

    boolean isPaymentsEnabled(@NotNull OfflinePlayer player);

    void setPaymentsEnabled(@NotNull OfflinePlayer player, boolean enabled);
}
