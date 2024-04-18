(ns data.map)

(def dillo1 {:type :dillo :alive? true :weight 10})
(def dillo2 {:type :dillo :alive? false :weight 8})

(defn make-dillo
  [alive? weight]
  {:alive? true :weight 10})

(defn dillo-weight
  [dillo]
  (:weight dillo))

(def parrot1 {:type :parrot :sentence "hello!" :weight 1})
(def parrot2 {:type :parrot :sentence "goodbye!" :weight 2})

;; Gürteltier überfahren
(defn run-over-dillo
  [dillo]
  (assoc dillo :alive? false)
  #_{:alive? false :weight (:weight dillo)})

;; Gürteltier füttern
(defn feed-dillo
  [dillo amount]
  (if (:alive? dillo) 
    ;; (assoc dillo :weight (+ (:weight dillo) amount))
    (update dillo :weight #(+ % amount)
            ;; (fn [old-weight] (+ old-weight amount))
            ) 
    dillo))


(defn run-over-parrot
  [parrot]
  (assoc parrot :sentence ""))

(defn run-over-animal
  [animal]
  (case (:type animal)
    :dillo (run-over-dillo animal)
    :parrot (run-over-parrot animal)))
    

