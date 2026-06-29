# ProxyWhitelist (Maintenance)

A network-wide whitelist and maintenance plugin for Minecraft proxies (BungeeCord and Velocity). Fork of [Maintenance by kennytv](https://github.com/kennytv/Maintenance).

## Features
- Whitelist/maintenance mode globally or per-backend server
- BungeeCord and Velocity support
- Bedrock/Geyser compatibility
- Built-in Discord bot for whitelist management
- Redis synchronization for multi-proxy setups

## Tech Stack
- **Language:** Java 21
- **Build System:** Gradle (Kotlin DSL), multi-module project
- **Modules:** `api`, `api-proxy`, `core`, `core-proxy`, `bungee`, `velocity`

## Building

Run the build:
```bash
export JAVA_HOME=/nix/store/k95pqfzyvrna93hc9a4cg5csl7l4fh0d-openjdk-21.0.7+6/lib/openjdk
export PATH=$JAVA_HOME/bin:$PATH
./gradlew build --no-daemon
```

Built JARs are output to each module's `build/libs/` directory.

The main distributable JARs (with all dependencies shaded) are in:
- `bungee/build/libs/` — BungeeCord plugin
- `velocity/build/libs/` — Velocity plugin

## Configuration
Edit `core/src/main/resources/config.yml` for default plugin configuration.

## User Preferences
