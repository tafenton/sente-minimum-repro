(ns data-importer.web
  (:require [taoensso.sente :as sente]
            [taoensso.sente.server-adapters.community.aleph :refer [get-sch-adapter]]))

(let [server (sente/make-channel-socket! (get-sch-adapter {}))])