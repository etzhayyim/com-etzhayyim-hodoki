(ns hodoki.test-runner
  (:require [clojure.test :as test]
            [hodoki.methods.test-agent]
            [hodoki.methods.test-charter-gates]
            [hodoki.murakumo-test]))

(def test-namespaces
  '[hodoki.methods.test-agent
    hodoki.methods.test-charter-gates
    hodoki.murakumo-test])

(defn -main [& _]
  (let [{:keys [fail error]} (apply test/run-tests test-namespaces)]
    (shutdown-agents)
    (System/exit (if (zero? (+ fail error)) 0 1))))
