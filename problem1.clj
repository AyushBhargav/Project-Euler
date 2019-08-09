(defn sum [l] (reduce + l))

(defn find_3_5 [num] (- (+ (sum (range 3 num 3)) (sum (range 5 num 5))) (sum (range 15 num 15))))

(find_3_5 1000) ;233168
