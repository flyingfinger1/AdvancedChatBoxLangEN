/*
 * Copyright (C) 2026 flyingfinger1
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package io.github.flyingfinger1.advancedchatbox.lang.en;

import io.github.darkkronicle.advancedchatbox.suggester.SpellCheckLanguageProvider;
import org.languagetool.Language;
import org.languagetool.language.AmericanEnglish;

/**
 * Registers American English as a spell-check language for AdvancedChatBox. Wired in via the
 * {@code advancedchatbox:spellcheck} entrypoint (see fabric.mod.json). Only the {@code language-en}
 * data is bundled here; the engine and its shared NLP pieces come from Box.
 */
public class EnglishProvider implements SpellCheckLanguageProvider {

    @Override
    public String code() {
        return "en";
    }

    @Override
    public String displayName() {
        return "English";
    }

    @Override
    public Language createLanguage() {
        return new AmericanEnglish();
    }
}
