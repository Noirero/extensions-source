# Doujindesu search regression

The `/api/manga?search=` listing can omit an existing exact-title manga. The fix keeps the existing listing search and supplements page 1 with `/api/manga/{slug}` only for keyword searches without restrictive status/category/genre filters.

Reproduction used during investigation: `Prison revenge` exists as `/manga/prison-revenge` in the website result HTML but was missing from the extension search result.
