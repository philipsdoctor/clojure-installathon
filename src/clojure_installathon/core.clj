(ns clojure-installathon.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn flip
  "Takes a function, returns a function that flips the order of the inputs"
  [the-function]
  (fn [first-arg second-arg] (the-function second-arg first-arg)))
