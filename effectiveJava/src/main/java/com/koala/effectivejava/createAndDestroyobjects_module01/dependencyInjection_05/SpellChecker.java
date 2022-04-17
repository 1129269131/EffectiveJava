package com.koala.effectivejava.createAndDestroyobjects_module01.dependencyInjection_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 第5条：
 *      优先考虑依赖注人来引用资源
 * Create by koala on 2022-04-17
 */
public class SpellChecker {

    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        return Boolean.FALSE;
    }

    public List suggestions(String type) {
        return new ArrayList();
    }
}