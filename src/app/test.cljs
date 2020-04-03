(ns app.test
  (:require [cljs.test]
            [app.core]))

(defn run-tests []
  (cljs.test/run-tests (cljs.test/empty-env) 'app.core))
