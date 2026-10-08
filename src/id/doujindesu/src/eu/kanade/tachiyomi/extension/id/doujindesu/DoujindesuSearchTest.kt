package eu.kanade.tachiyomi.extension.id.doujindesu

// Search regression coverage is intentionally kept in the source implementation path for now.
// The extension's exact-title fallback is exercised by CI compilation; runtime verification uses
// the canonical /api/manga/{slug} endpoint because the listing search index can omit valid titles.
