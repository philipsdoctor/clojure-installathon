(ns clojure-installathon.core-test
  (:require [clojure.test :refer :all]
            [clojure-installathon.core :refer :all]))

(deftest flip-test
  (testing "4clojure higher order function"
    (is (= 3 ((flip nth) 2 [1 2 3 4 5])))
    (is (= true ((flip >) 7 8)))
    (is (= 4 ((flip quot) 2 8)))
    (is (= [1 2 3] ((flip take) [1 2 3 4 5] 3)))))
