(ns app.core
  (:require [cljs.test :refer [deftest is async]]
            [app.utils]))

(deftest test-async
  (app.utils/test-promise
    (-> (.resolve js/Promise)
        (.then #(is false)))))
