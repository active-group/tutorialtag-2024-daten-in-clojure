(ns data.defrecord)

(defrecord Dillo [alive? weight])

(def dillo1 (->Dillo true 10))

