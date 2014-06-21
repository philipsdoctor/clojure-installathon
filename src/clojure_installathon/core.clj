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

(defn distinct-item
  "Removes duplicate items from a sequence, preserving order"
  [repeat-collection]
  (loop [current-collection repeat-collection
         return-collection []]
    (if (empty? current-collection)
      return-collection
      (if (contains? (set return-collection) (first current-collection))
        (recur (rest current-collection) return-collection)
        (recur (rest current-collection)
               (conj return-collection (first current-collection)))))))

(defn recursive
  "a recursive function that will overflow"
  [seq current-iteration]
    (prn current-iteration)
  (recursive seq (inc current-iteration)))
