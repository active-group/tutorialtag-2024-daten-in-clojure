(ns data.defrecord)

(defrecord Dillo [alive? weight])

(def dillo1 (->Dillo true 10))
(def dillo1 (->Dillo false 8))
