(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true)))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (or (list? x) (vector? x)) (if (empty? x) nil (* 2 (count x)))
    (and (map? x) (empty? x)) nil
    :else true))

; A year is a leap year if it is divisible by 4, except if it is divisible by 100, in which case it still is a leap
; year if it is divisible by 400.
(defn leap-year? [year]
  (if (and (divides? 4 year)
           (or (not (divides? 100 year))
               (divides? 400 year)))
    true
    false))

; '_______'
