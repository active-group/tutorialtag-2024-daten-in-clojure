(ns data.map)

(def dillo1 {:alive? true :weight 10})
(def dillo2 {:alive? false :weight 8})

(defn make-dillo
  [alive? weight]
  {:alive? true :weight 10})

(defn dillo-weight
  [dillo]
  (:weight dillo))

(def parrot1 {:sentence "hello!" :weight 1})
(def parrot2 {:sentence "goodbye!" :weight 2})

;; Gürteltier überfahren
(defn run-over-dillo
  [dillo]
  (assoc dillo :alive? false)
  #_{:alive? false :weight (:weight dillo)})



