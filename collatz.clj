;; The collatz conjecture function written in Clojure
;; AUTHOR: Aidan Simon

(defn good-number?
  [n]
  (if (< n 1)
    false
    true))

(defn collatz
  [n]
  (cond
    (= n 1) (do (println n) (println "Done."))
    (even? n) (do (println n) (collatz (/ n 2)))
    :else (do (println n) (collatz (inc (* n 3))))))

(defn -main
  "Ask the user for input into collatz function"
  []
  (do
    (println "What is your number")
    (let [n (Integer/parseInt (read-line))]
      (if (good-number? n)
        (collatz n)
        (-main)))))
