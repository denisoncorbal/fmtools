package br.com.dgc.fmtools.domain.model.constants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.dgc.fmtools.domain.model.TacticalPosition;
import br.com.dgc.fmtools.domain.model.constants.lists.AmclrAttributesList;
import br.com.dgc.fmtools.domain.model.constants.lists.AmlrAttributesList;
import br.com.dgc.fmtools.domain.model.constants.lists.DclrAttributesList;
import br.com.dgc.fmtools.domain.model.constants.lists.DlrAttributesList;
import br.com.dgc.fmtools.domain.model.constants.lists.DmclrAttributesList;
import br.com.dgc.fmtools.domain.model.constants.lists.GkAttributesList;
import br.com.dgc.fmtools.domain.model.constants.lists.MclrAttributesList;
import br.com.dgc.fmtools.domain.model.constants.lists.MlrAttributesList;
import br.com.dgc.fmtools.domain.model.constants.lists.StclrAttributesList;
import br.com.dgc.fmtools.domain.model.constants.lists.WblrAttributesList;
import br.com.dgc.fmtools.domain.model.interfaces.PlayerAttributes;

public class PositionAttributesList {
        private static PositionAttributesList actualInstance = null;
        private Map<String, List<PlayerAttributes>> preferableAttributesMapping;
        private Map<String, List<PlayerAttributes>> keyAttributesMapping;

        private PositionAttributesList() {
                preferableAttributesMapping = new HashMap<>();
                keyAttributesMapping = new HashMap<>();

                GkAttributesList gkAttributesList = new GkAttributesList();
                DlrAttributesList dlrAttributesList = new DlrAttributesList();
                DclrAttributesList dclrAttributesList = new DclrAttributesList();
                WblrAttributesList wblrAttributesList = new WblrAttributesList();
                DmclrAttributesList dmclrAttributesList = new DmclrAttributesList();
                MlrAttributesList mlrAttributesList = new MlrAttributesList();
                MclrAttributesList mclrAttributesList = new MclrAttributesList();
                AmlrAttributesList amlrAttributesList = new AmlrAttributesList();
                AmclrAttributesList amclrAttributesList = new AmclrAttributesList();
                StclrAttributesList stclrAttributesList = new StclrAttributesList();

                keyAttributesMapping.putAll(gkAttributesList.getKeyAttributesMapping());
                preferableAttributesMapping.putAll(gkAttributesList.getPreferableAttributesMapping());

                keyAttributesMapping.putAll(dlrAttributesList.getKeyAttributesMapping());
                preferableAttributesMapping.putAll(dlrAttributesList.getPreferableAttributesMapping());

                keyAttributesMapping.putAll(dclrAttributesList.getKeyAttributesMapping());
                preferableAttributesMapping.putAll(dclrAttributesList.getPreferableAttributesMapping());

                keyAttributesMapping.putAll(wblrAttributesList.getKeyAttributesMapping());
                preferableAttributesMapping.putAll(wblrAttributesList.getPreferableAttributesMapping());

                keyAttributesMapping.putAll(dmclrAttributesList.getKeyAttributesMapping());
                preferableAttributesMapping.putAll(dmclrAttributesList.getPreferableAttributesMapping());

                keyAttributesMapping.putAll(mlrAttributesList.getKeyAttributesMapping());
                preferableAttributesMapping.putAll(mlrAttributesList.getPreferableAttributesMapping());

                keyAttributesMapping.putAll(mclrAttributesList.getKeyAttributesMapping());
                preferableAttributesMapping.putAll(mclrAttributesList.getPreferableAttributesMapping());

                keyAttributesMapping.putAll(amlrAttributesList.getKeyAttributesMapping());
                preferableAttributesMapping.putAll(amlrAttributesList.getPreferableAttributesMapping());

                keyAttributesMapping.putAll(amclrAttributesList.getKeyAttributesMapping());
                preferableAttributesMapping.putAll(amclrAttributesList.getPreferableAttributesMapping());

                keyAttributesMapping.putAll(stclrAttributesList.getKeyAttributesMapping());
                preferableAttributesMapping.putAll(stclrAttributesList.getPreferableAttributesMapping());
        }

        public static PositionAttributesList getInstance() {
                if (PositionAttributesList.actualInstance == null)
                        PositionAttributesList.actualInstance = new PositionAttributesList();
                return actualInstance;
        }

        public List<PlayerAttributes> getPreferableAttributesList(TacticalPosition tacticalPosition) {
                return this.preferableAttributesMapping.get(tacticalPosition.getFieldPosition().name()
                                + tacticalPosition.getRole().name() + tacticalPosition.getDuty().name());
        }

        public List<PlayerAttributes> getKeyAttributesList(TacticalPosition tacticalPosition) {
                return this.keyAttributesMapping.get(tacticalPosition.getFieldPosition().name()
                                + tacticalPosition.getRole().name() + tacticalPosition.getDuty().name());
        }

}