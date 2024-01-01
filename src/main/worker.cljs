(ns worker)

(defn handler
  [request env ctx]
  (js/Promise.resolve (new js/Response
                           "Hello ClojureScript!")))

(def ^:export worker #js {:fetch handler})