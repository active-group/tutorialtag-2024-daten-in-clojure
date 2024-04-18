(ns data.map)

(def dillo1 {:alive? true :weight 10})
(def dillo2 {:alive? false :weight 8})

(defn make-dillo
  [alive? weight]
  {:alive? true :weight 10})

(defn dillo-weight
  [dillo]
  (:weight dillo))
