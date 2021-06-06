(ns euler.level1.problem010-spec
 (:require
  [speclj.core :refer :all]
  [euler.level1.problem010 :refer :all]))

; https://projecteuler.net/problem=10

(describe "Euler Problem #10"

 (it "check if n is not divisible"
  (should (non-divisible? 3 2))
  (should-not (non-divisible? 4 2))
  (should (non-divisible? 4 3))
  )

 (it "check if n prime"
  (should (prime? 2))
  (should (prime? 3))
  (should-not (prime? 4))
  (should (prime? 5))
  (should-not (prime? 45))
  (should-not (prime? 10001))
  )

 (it "get primes below n"
  (should= [] (get-primes-below-n 2))
  (should= [2] (get-primes-below-n 3))
  (should= [2 3] (get-primes-below-n 4))
  (should= [2 3 5 7] (get-primes-below-n 10))
  )

 (it "get sum of primes below n"
  (should= 0 (get-sum-primes-below-n 2))
  (should= 2 (get-sum-primes-below-n 3))
  (should= 5 (get-sum-primes-below-n 4))
  (should= 17 (get-sum-primes-below-n 10))
  )

 (it "Solves #10"
  (should= 17 (euler-10 10))
  (should= 28 (euler-10 12))
  (should= 41 (euler-10 14))
  (should= 142913828922 (euler-10 2e6))
  )
 )

(run-specs)
