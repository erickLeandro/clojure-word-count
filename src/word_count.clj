(ns word-count
	(:require [clojure.string :as s]))

(defn word-count [words] 
  (frequencies 
    (re-seq #"[\w0-9]+" (s/lower-case words))))