(defn even-fibonacci-sum
  ([max-num] (even-fibonacci-sum 1 2 0 max-num))
  ([a b sum max-num]
   (if (>= b max-num)
     sum
     (if (even? b)
       (even-fibonacci-sum b (+ a b) (+ sum b) max-num)
       (even-fibonacci-sum b (+ a b) sum max-num)))))

(defn -main
  [& args]
  (println (even-fibonacci-sum 4000000)))
; 461373
