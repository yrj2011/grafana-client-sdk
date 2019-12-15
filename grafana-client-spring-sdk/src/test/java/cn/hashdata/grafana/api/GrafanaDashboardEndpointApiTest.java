/*
 * Grafana
 * Grafana Restful API.
 *
 * OpenAPI spec version: v1.0
 * Contact: wang@hashdata.cn
 *
 */


package cn.hashdata.grafana.api;

import cn.hashdata.grafana.model.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;
import org.junit.Ignore;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GrafanaDashboardEndpointApi
 */
@Ignore
public class GrafanaDashboardEndpointApiTest {

    private final GrafanaDashboardEndpointApi api = new GrafanaDashboardEndpointApi();

    
    /**
     * CreateAndUpdateDashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAndUpdateDashboardUsingPOSTTest() {
        SaveDashboardCommand request = null;
        CreateDashboardResponse response = api.createAndUpdateDashboardUsingPOST(request);

        // TODO: test validations
    }
    
    /**
     * DeleteDashboardByUID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDashboardByUIDUsingDELETETest() {
        String uid = null;
        Message response = api.deleteDashboardByUIDUsingDELETE(uid);

        // TODO: test validations
    }
    
    /**
     * GetDashboardByUID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDashboardByUIDUsingGETTest() {
        Gson gson = new Gson();
        String uid = "kyJgQ4fZz";
        DashboardFullWithMeta response = api.getDashboardByUIDUsingGET(uid);

        System.out.println(gson.toJson(response));

        SaveDashboardCommand request = new SaveDashboardCommand();

        Dashboard dashboard = response.getDashboard();

        request.setOverwrite(true);
        request.setDashboard(dashboard);
        request.setFolder(false);
        request.setFolderId(response.getMeta().getFolderId());

        List<Panel> panels = dashboard.getPanels();
        panels.forEach(panel -> {
            GridPos gridPos = panel.getGridPos();
            gridPos.setW(20);
            gridPos.setH(10);
        });
        System.out.println(gson.toJson(response));
        /*CreateDashboardResponse response2 = api.createAndUpdateDashboardUsingPOST(request);
        System.out.println(response2);*/
    }

    @Test
    public void testGson(){
        String value = "{\"meta\":{\"type\":\"db\",\"canSave\":true,\"canEdit\":true,\"canAdmin\":true,\"canStar\":true,\"slug\":\"123\",\"url\":\"/d/kyJgQ4fZz/123\",\"expires\":\"0001-01-01T00:00:00Z\",\"created\":\"2019-12-15T05:33:30Z\",\"updated\":\"2019-12-15T05:34:35Z\",\"updatedBy\":\"admin\",\"createdBy\":\"admin\",\"version\":3,\"hasAcl\":false,\"isFolder\":false,\"folderId\":0,\"folderTitle\":\"General\",\"folderUrl\":\"\",\"provisioned\":false,\"provisionedExternalId\":\"\"},\"dashboard\":{\"annotations\":{\"list\":[{\"builtIn\":1,\"datasource\":\"-- Grafana --\",\"enable\":true,\"hide\":true,\"iconColor\":\"rgba(0, 211, 255, 1)\",\"name\":\"Annotations \\u0026 Alerts\",\"type\":\"dashboard\"}]},\"editable\":true,\"gnetId\":null,\"graphTooltip\":0,\"id\":1,\"links\":[],\"panels\":[{\"aliasColors\":{},\"bars\":false,\"dashLength\":10,\"dashes\":false,\"description\":\"\",\"fill\":1,\"fillGradient\":0,\"gridPos\":{\"h\":9,\"w\":12,\"x\":0,\"y\":0},\"id\":2,\"legend\":{\"avg\":false,\"current\":false,\"max\":false,\"min\":false,\"show\":true,\"total\":false,\"values\":false},\"lines\":true,\"linewidth\":1,\"nullPointMode\":\"null\",\"options\":{\"dataLinks\":[]},\"percentage\":false,\"pointradius\":2,\"points\":false,\"renderer\":\"flot\",\"seriesOverrides\":[],\"spaceLength\":10,\"stack\":false,\"steppedLine\":false,\"targets\":[{\"expr\":\"event_bus_node_167_1\",\"legendFormat\":\"b\",\"refId\":\"A\"}],\"thresholds\":[],\"timeFrom\":null,\"timeRegions\":[],\"timeShift\":null,\"title\":\"a\",\"tooltip\":{\"shared\":true,\"sort\":0,\"value_type\":\"individual\"},\"type\":\"graph\",\"xaxis\":{\"buckets\":null,\"mode\":\"time\",\"name\":null,\"show\":true,\"values\":[]},\"yaxes\":[{\"format\":\"short\",\"label\":null,\"logBase\":1,\"max\":null,\"min\":null,\"show\":true},{\"format\":\"short\",\"label\":null,\"logBase\":1,\"max\":null,\"min\":null,\"show\":true}],\"yaxis\":{\"align\":false,\"alignLevel\":null}}],\"schemaVersion\":19,\"style\":\"dark\",\"tags\":[],\"templating\":{\"list\":[]},\"time\":{\"from\":\"now-6h\",\"to\":\"now\"},\"timepicker\":{},\"timezone\":\"\",\"title\":\"123\",\"uid\":\"kyJgQ4fZz\",\"version\":3}}";

        DashboardFullWithMeta meta = null;

        Type typeOfT = new TypeToken<DashboardFullWithMeta>(){}.getType();

        Gson gson = new Gson();

        meta = gson.fromJson(value,typeOfT);

        System.out.println(meta);

    }
    /**
     * GetDashboardTags
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDashboardTagsUsingGETTest() {
        List<DashboardTagCloudItem> response = api.getDashboardTagsUsingGET();

        // TODO: test validations
    }

    /**
     * GetHomeDashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHomeDashboardUsingGETTest() {
        String uid = null;
        DashboardFullWithMeta response = api.getHomeDashboardUsingGET(uid);

        // TODO: test validations
    }
    
}
