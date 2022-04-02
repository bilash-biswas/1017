(let [num1 (do (Integer/parseInt (read-line)))
     num2 (do (Integer/parseInt (read-line)))] 
  (println (format "%.3f" (* num1 (float(/ num2 12))))))
