# AdvancedChatBox Language: English

English spell-check data for [AdvancedChatBox](https://github.com/flyingfinger1/AdvancedChatBox).

AdvancedChatBox ships only the LanguageTool **engine**; each language's dictionary and NLP data is
large and lives in its own small add-on. Install this mod to enable **English** spell-checking in the
chat box. It plugs into Box through the `advancedchatbox:spellcheck` entrypoint and is picked
automatically when your Minecraft language is English.

## Requirements

| | Version |
| --- | --- |
| Minecraft | **26.3** |
| Java | **25** |
| [AdvancedChatBox](https://github.com/flyingfinger1/AdvancedChatBox) | **1.2.3+** |

AdvancedChatBox (and its own dependencies — AdvancedChatCore, MaLiLib, Fabric API) must be installed.
Without AdvancedChatBox this mod does nothing.

## What's bundled

The `language-en` data plus the English-specific opennlp POS/chunk/tokenize models (~9 MB) that
English's rules need. The shared LanguageTool engine comes from AdvancedChatBox, so nothing is
duplicated.

## Building

Publish AdvancedChatBox locally first, then build:

```
# in the AdvancedChatBox clone
./gradlew publishToMavenLocal

# then here
./gradlew build
```

The build needs a **JDK 25** toolchain.

## License

MPL-2.0.
