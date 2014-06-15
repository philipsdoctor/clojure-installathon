(ns clojure-installathon.core-test
  (:require [clojure.test :refer :all]
            [clojure-installathon.core :refer :all]))

(deftest flip-test
  (testing "4clojure higher order function"
    (is (= 3 ((flip nth) 2 [1 2 3 4 5])))
    (is (= true ((flip >) 7 8)))
    (is (= 4 ((flip quot) 2 8)))
    (is (= [1 2 3] ((flip take) [1 2 3 4 5] 3)))))


(deftest distinct-item-test
  (testing "4clojure immutable data for problem 56"
    (is (= (distinct-item [1 2 1 3 1 2 4]) [1 2 3 4]))
    (is (= (distinct-item [:a :a :b :b :c :c]) [:a :b :c]))
    (is (= (distinct-item '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
    (is (= (distinct-item (range 50)) (range 50)))))
