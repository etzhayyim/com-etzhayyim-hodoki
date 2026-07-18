# hodoki 解き — Maturity

**Stage: R0** (scaffold) — ELV disassembly and materials recovery. The actor closes circular
feeds with kanayama, makura, silicon, and hikari, with constitutional G8 data-wipe and G12
right-to-repair gates.

| Dimension | State |
|---|---|
| Lexicons | ✅ 8 Datomic-native definitions plus 8 canonical EDN imports of the central wire contracts in `data/lex/` |
| Cells | 🟡 9 R0 declarations in `data/cells/`; social state-machine CLJC in `src/hodoki/cells/` |
| Manifest | ✅ canonical `manifest.edn`; JSON-LD mirror in `wire/manifest.jsonld` |
| Tests | ✅ 43 tests / 90 assertions via `clojure -M -m hodoki.test-runner` |
| Methods | 🟡 agent, social, and MCP ingestion CLJC; physical disassembly remains R1 |
| Policy audit | ✅ canonical EDN parse, wire boundary, and deprecated-language checks via `bb scripts/audit.clj` |

## Substrate-native status

EDN is authoritative. JSON and JSON-LD are isolated under `wire/`; the central eight hodoki
JSON contracts have matching `data/lex/*.wire.edn` canonical imports. Runtime and tests are
Clojure/CLJC. Python, its cross-language parity harness, deployment shell, Go, and TinyGo are
pruned rather than ported.

The charter suite pins G1–G14, civilian-only intake, G6 F-gas capture, G7 battery safety,
G8 data destruction, G12 right-to-repair, G13 circular feed, and G14 PGM recovery.

## R0 → R1 gate

`silenDeconstructionReview` R1 activation plus Council Safe transaction; physical cell
execution stays R0-gated until then.
