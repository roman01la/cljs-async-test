(ns app.utils
  (:require [cljs.test :refer [async]]))

(defn test-promise [p]
  (async done (.then p #(done))))
