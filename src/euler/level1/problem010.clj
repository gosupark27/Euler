(ns euler.level1.problem010)

(defn non-divisible? [n div]
  (not (= 0 (mod n div))))

(defn prime? [n]
  (= 0 (count (filter #(false? (non-divisible? n %)) (range 2 (inc (int (Math/sqrt n))))))))

(defn get-primes-below-n [n]
  (filter #(prime? %) (range 2 n)))

(defn get-sum-primes-below-n [n]
  (apply + (get-primes-below-n n)))

(defn euler-10 [n]
  (get-sum-primes-below-n n))


